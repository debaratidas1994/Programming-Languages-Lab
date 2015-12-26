'''
The criteria to be met to create closure:
1.We must have a nested function (function inside a function).
2.The nested function must refer to a value defined in the enclosing function.
3.The enclosing function must return the nested function.
'''

def outer(m):
	def inner(x):
		return x**m
	return inner


a=outer(2)
print(a(2))