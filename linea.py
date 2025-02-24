class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"
class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"linea d {self.p1} a {self.p2}"

    def dibujaLinea(self):
        print(f"dibujando la linea de {self.p1} a {self.p2}")
