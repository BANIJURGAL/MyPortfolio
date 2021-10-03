class Payroll(object):
    def __init__(self, name, rate, hoursworked):
        self.name = name
        self.rate = rate
        self.hour = hoursworked
        self.reg = 40
        self.grosspay = 0
        self.OTpay = 0

    def getVar(self):
        return self.name, self.rate, self.hour

    def grossPay(self):
        if self.hour <= self.reg:
            self.grosspay = self.hour * self.rate
            return self.grosspay
        else:
            self.OTPay()
            
    def OTPay(self):
        OThours = self.hour - self.reg
        self.OTpay = self.rate * OThours * 1.5
        self.grosspay = self.reg * self.rate
        self.takeHome = self.OTpay + self.grosspay
        return self.takeHome

    def __str__(self):
        if self.hour <= self.reg:
            return "Name: " + self.name + "\nHours Worked: " + str(self.hour) + "\nRate: " \
                   + str(self.rate) + "\nTake Home: " + str(self.grosspay) + "\n"

        else:
            return "Name: " + self.name + "\Hours worked: " + str(self.hour) + "\nRate: " \
                   + str(self.rate) + "\nGross Pay: " + str(self.grosspay) + "\nOTP Pay: " \
                   + str(self.OTpay) + "\nTake Home: " + str(self.takeHome)
        
