def foo(a,name):
	print("Inside foo",a)
	name()
	
def bar():
	print("Inside bar")

foo(5,bar)		
