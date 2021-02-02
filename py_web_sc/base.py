import requests
from bs4 import BeautifulSoup


class Base():
    def __init__(self):
        pass

    def page_parse(self):
        header = {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Whale/2.8.108.15 Safari/537.36"
        }

        soup = []
        for url in self.url:
            res = requests.get(url, headers=header)
            soup.append(BeautifulSoup(res.text, 'html.parser'))

        return soup