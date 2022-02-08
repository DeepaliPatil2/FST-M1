import pytest
def testAddition():

    number1 = 20
    number2 = 10
    sum = number1 + number2

    assert sum == 30

def testSubtraction():

    number1 = 20
    number2 = 10
    sub = number1 - number2
    assert sub == 10

@pytest.mark.activity
def testMultiplication():

    number1 = 20
    number2 = 10
    mul = number1 * number2

    assert mul == 200

@pytest.mark.activity
def testDivision():

    number1 = 20
    number2 = 10
    div = number1 / number2

    assert div == 2
