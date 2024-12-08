package day5_08122024.sealedTypes;

public sealed interface Shape
permits Circle, Rectangle, Square {
double area();
}

