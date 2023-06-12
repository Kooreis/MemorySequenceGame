def get_list_from_user(difficulty):
    print("After seeing the numbers, enter the numbers you saw, each followed by Enter.")
    return [int(input()) for _ in range(difficulty)]