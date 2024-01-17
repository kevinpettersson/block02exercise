# package exercises
#
#
# Program to exercise lists
#
# See:
# - ListBasics
#


# THE INPUT FUNCTIONS
# Method returns a list of 5 integers by asking the user to input 5 with space in between.
# The method does a for each loop in the temporary list then append each integer into the final list.
def get_list_of_ints_from_user():
    input_as_string = input("Input 5 integers (space between, then enter) > ")
    the_int_strs = input_as_string.split(" ")
    the_ints = []
    for int_str in the_int_strs:
        the_ints.append(int(int_str))
    return the_ints

# Method asks for a value to find from the user.
def get_value_from_user():
    return int(input("Input a value to find > "))


# THE OUTPUT FUNCTIONS
# Prints out the value and at what index we found it.
def print_index_to_user(the_index, the_value):
    print(f"Value {the_value} is at index {the_index}")

# prints out the value and that we didnt find it in the list.
def print_not_found_to_user(the_value):
    print(f"Value {the_value} not found")

# if we dont find the value in the list we call print-not-found function, else we call the index-to-user func.
def print_result_to_user(the_index, the_value):
    if the_index is None:
        print_not_found_to_user(the_value)
    else:
        print_index_to_user(the_index, the_value)
    pass


# THE ALGORITHM
# We search the value in the list and when we find it we return the index.
def find_index_of_value(a_list, a_value):
    for i in range(len(a_list)):
        if a_value == a_list[i]:
            return i


# THE TOP-LEVEL BEHAVIOR
def list_basics_program():
    # INPUT
    the_list = get_list_of_ints_from_user()
    the_value = get_value_from_user()
    # PROCESS
    the_index = find_index_of_value(the_list, the_value)
    # OUTPUT
    print_result_to_user(the_index, the_value)


# Recommended way to make module executable
if __name__ == "__main__":
    list_basics_program()
