# package exercises

from math import pi


# Program to calculate the surface area of a sphere
# See https://en.wikipedia.org/wiki/Sphere#Surface_area
#
# Formula is: area = 4 * pi * radius² (m²)
# @staticmethod

# Method returns a float and taking no parameters.
# First prints out to the user then takes the users input and does a implicit type conversion to float.
def input_radius() -> float:
    return float(input("Give me a radius please > "))


# @staticmethod
# Void method takes the_area as parameter, prints out the area as a float-number.
def print_area_result(the_area: float):
    print(f"This is the area: {the_area}")


# @staticmethod
# Method returns the_area with explicit type conversion to double, it takes the_radius as parameter.
def calculate_area_of_sphere(the_radius):
    the_area = 4 * pi * the_radius ** 2
    return the_area


# @staticmethod
# Void method define the variable the_radius, and another for the area by calling another function
# as a result we call another function that prints out the area.
def calculate_sphere_area_program():
    the_radius = input_radius()
    the_area = calculate_area_of_sphere(the_radius)
    print_area_result(the_area)


# Recommended way to make module executable

if __name__ == "__main__":
    calculate_sphere_area_program()
