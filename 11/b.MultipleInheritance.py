class fun1:
	def __init__(self):
		print('fun1')

class fun2:
	def __init__(self):
		print('fun2')
	def display(self):
		print('yolo@fun2')

class fun3(fun1,fun2):
	def __init__(self): 
		super.display()

fun3()