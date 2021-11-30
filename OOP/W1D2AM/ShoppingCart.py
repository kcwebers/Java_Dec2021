class ShoppingCart:

    def __init__(self):
        self.store = ""
        self.total = 0.0
        self.items = []

    def add_item(self, item, price):
        self.items.add(item)
        self.total += price