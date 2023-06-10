import random
import time

def generate_sequence(difficulty):
    return [random.randint(1, 101) for _ in range(difficulty)]

def get_list_from_user(difficulty):
    print("After seeing the numbers, enter the numbers you saw, each followed by Enter.")
    return [int(input()) for _ in range(difficulty)]

def is_list_equal(list_a, list_b):
    return list_a == list_b

def play(difficulty):
    sequence = generate_sequence(difficulty)
    print(sequence)
    time.sleep(0.7)
    for _ in range(50):
        print('\n')
    user_sequence = get_list_from_user(difficulty)
    return is_list_equal(sequence, user_sequence)

def main():
    difficulty = int(input("Please choose game difficulty from 1 to 5: "))
    if play(difficulty):
        print("You won!")
    else:
        print("You lost!")

if __name__ == "__main__":
    main()