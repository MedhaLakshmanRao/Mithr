from tinydb import TinyDB, Query

db = TinyDB('test_db.json')

intro=raw_input("Hey pal! Let me assist you with anything you wanna know about any product. Just show me the product and i will help u out!")
print intro
#intro="1"

test_query = Query()
prod = db.search(test_query.id == intro)

if len(prod)>0:
	print "name:", prod[0]['name']
	print "price:", prod[0]['price']
	print "description:", prod[0]['description']
	try :
		print "exp_date:" + prod[0]['exp_date']
	except KeyError:
		pass
	try:
		print "ingredients:"+ prod[0]['ingredients']
	except KeyError:
		pass

	import pyttsx
	engine = pyttsx.init()
	engine.say("Name" + prod[0]['name'])
	engine.say("Price" + prod[0]['price'])
	engine.say("description" + prod[0]['description'])
	try:
		engine.say("expiry date" + prod[0]['exp_date'])
	except KeyError:
		pass
	try:
		engine.say("ingredients" + prod[0]['ingredients'])
	except KeyError:
		pass

	engine.runAndWait()

else:
	print "item not found"