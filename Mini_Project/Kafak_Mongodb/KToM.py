import ujson
from kafka import KafkaConsumer
from pymongo import MongoClient
from time import sleep
 
pyclient = MongoClient("mongodb://localhost:27017/")
water5_db = pyclient["water5"]
information_db = water5_db["information"]


consumer = KafkaConsumer(
     "LToK5",
     group_id = 'group1',
     bootstrap_servers=['hadoop01:9092'],
     auto_offset_reset='earliest',
     enable_auto_commit=True,
     # value_deserializer=lambda x: ujson.loads(x.decode('utf-8'))
)
while True:
    message = consumer.poll()
    if len(message) == 0: sleep(1)
    for topic_partition, records in message.items():
        for record in records:
            parsed_record = ujson.loads(record.value)
            information_db.insert_one(parsed_record)
    # consumer.commit()
consumer.close()