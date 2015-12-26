def add(*args,**kwargs):
	print("positional args: ", str(args))
	print("Keyword args: ",str(kwargs))

add('hello','bye',a="yolo",b="yolosweg")