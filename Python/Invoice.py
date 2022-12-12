class Invoice:

    def __init__(self):
        self.items = {}

    def addProduct(self, qnt, price, discount):
        self.items['qnt'] = qnt
        self.items['unit_price'] = price
        self.items['discount'] = discount
        return self.items

    def totalImpurePrice(self, products):
        total_impure_price = 0
        ## Complete the missing part of this fuction here
        for key in products:
            total_impure_price += products[key]['qnt'] * products[key]['unit_price']
        return total_impure_price

    def totalDiscount(self, products):
        total_discount = 0
        ## Complete the missing part of this fuction here
        ##self.total_discount = total_discount
        for key in products:
            total_discount += (products[key]['qnt'] * products[key]['unit_price']) * (products[key]['discount']/100)
        return round(total_discount,2)

    def totalPurePrice(self, products):
        total_pure_price = 0
        ## Complete the missing part of this fuction here
        total_pure_price = self.totalImpurePrice(products) - self.totalDiscount(products)
        return total_pure_price

    def priceOfSalesTax (self, products):
        SALES_TAX_RATE = 0.045
        total_sales_price = self.totalPurePrice(products) * SALES_TAX_RATE
        return round(total_sales_price,2)

    def finalSalesPrice(self,products):
        final_sales_price = 0
        final_sales_price = self.totalPurePrice(products) + self.priceOfSalesTax(products)
        return round(final_sales_price, 2)

    def inputAnswer(self, input_value):
        while True:
            userInput = input(input_value)
            if userInput in ['y', 'n']:
                return userInput
                break
            print("y or n! Try again.")

    def inputNumber(self, input_value):
        while True:
            try:
                userInput = float(input(input_value))
            except ValueError:
                print("Not a number! Try again.")
                continue
            else:
                return userInput
                break
