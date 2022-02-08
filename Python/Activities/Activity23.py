
import pytest

@pytest.fixture
def numberList():

    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    return list

def testSum(numberList):

    # Initialize sum
    sum = 0

    # Add number in the list
    for n in numberList:
        sum += n

    # Assertion
    assert sum == 55
