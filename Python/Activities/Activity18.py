
import pandas
data = pandas.read_csv("employees.csv")

print("Data: ")
print(data)
print("===============")
print("Usernames:")
print(data["Usernames"])

print("===============")
print("UserName: ", data["Usernames"][1], " | ", "Password: ", data["Passwords"][1])

print("====================================")
print("Data sorted in ascending Usernames:")
print(data.sort_values('Usernames'))

print("====================================")
print("Data sorted in descending Passwords:")
print(data.sort_values('Passwords', ascending=False))