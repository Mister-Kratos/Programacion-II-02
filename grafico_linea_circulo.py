import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x},{self.y})"

    def getX(self):
        return self.x
    def getY(self):
        return self.y

class Linea:
    def __init__(self, p1:Punto, p2:Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea de {self.p1} a {self.p2}"

    def dibujaLinea(self):
        x = [self.p1.getX(), self.p2.getX()]
        y = [self.p1.getY(), self.p2.getY()]
        plt.plot(x,y, marker='o', linestyle='-')
        plt.show()


class Circulo:
    def __init__(self, centro:Punto, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo con centro {self.centro} y radio {self.radio}"

    def dibujaCirculo(self):
        centro = (self.centro.getX(), self.centro.getY())
        radio = self.radio

        fig, ax = plt.subplots()

        circulo = plt.Circle(centro, radio, color='b', fill=False)
        ax.add_patch(circulo)
        ax.set_xlim(centro[0] - radio - 1, centro[0] + radio + 1)
        ax.set_ylim(centro[1] - radio - 1, centro[1] + radio + 1)
        ax.set_aspect('equal')

        plt.show()

p = Punto(5,5)
circulo = Circulo(p, 3)
print(circulo)
circulo.dibujaCirculo()
[20:48, 23/2/2025] .....: import Punto, Linea

linea = Linea.Linea(Punto.Punto(1,1), Punto.Punto(4,4))
print(linea)

[20:48, 23/2/2025] .....: .
[20:48, 23/2/2025] .....: import matplotlib.pyplot as plt

centro = (2, 3)
radio = 5

fig, ax = plt.subplots()

circulo = plt.Circle(centro, radio, color='b', fill=False)

ax.add_patch(circulo)
ax.set_xlim(centro[0] - radio - 1, centro[0] + radio + 1)
ax.set_ylim(centro[1] - radio - 1, centro[1] + radio + 1)
ax.set_aspect('equal')

plt.show()
[20:48, 23/2/2025] .....: import matplotlib.pyplot as plt

x = [10, 40]
y = [20, 80]

plt.plot(x, y, marker='o', linestyle='-')

plt.show()
