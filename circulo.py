class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo centradi en {self.centro} y radio {self.radio}"

    def dibujaCirculo(self):
        print(f"dibujando el circulo con centro {self.centro} y radio {self.radio}")
