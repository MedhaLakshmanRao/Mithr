from tinydb import TinyDB, Query

db = TinyDB('test_db.json')

test_data = [{'id':'8906002485000','name':'Pedigree Puppy Chicken, Milk 3 kg Dry Dog Food', 'price':'493.00 rs', 'description':'Your naughty little dog needs much more than simple home cooked food. Serve him this tasty and healthy dish of chicken and milk from Pedigree and watch him grow to love his meals and turn into a healthier and stronger dog.', 'exp_date':'23.08.2018', 'ingredients':''},
			{'id':'8901030681905','name':'Surf Excel Easy Wash Detergent Powder, 500 gm Pouch', 'price':'56.00 rs', 'description':' Surf excel Easy Wash is a superfine powder that removes tough stains in a jiffy and leaves no residue on your clothes. Being a superfine and fluffy powder it dissolves easily and reaches the stain and removes it easily.', 'exp_date':'31.08.2018','ingredients':''},
			{'id':'8901071211338','name':'Hershey\'s Spreads, Cocoa, 300g', 'price':'235.00 rs', 'description':'Hershey\'s cocoa powder is classic unsweetened, natural, non alkalized cocoa powder that is ideal for hot cocoa, frostings, cakes, brownies and other rich chocolate desserts or as a spread on bread or as a dip for fruits and vegetables.', 'exp_date':'25.4.18', 'ingredients':'Sugar, Edible Vegetable Oil,Milk Solids, Cocoa Solids,Antioxidant, Edible common salt'},
			{'id':'8904240708585','name':'Syska SSK-SQ1801 Tubelight (White)', 'price':'280.00 rs', 'description':'Slim LED tube light in aluminium housing highly energy efficient and good color rendering long life span of 50000 hours', 'exp_date':'', 'ingredients':''},
			{'id':'8904146990572','name':'Agri Pure Matta Vadi Rice - Long Grain DB, 5kg Bag', 'price':'495.00 rs', 'description':'Good taste and healthy grain','expiry_date':'3.09.2018','ingredients':''},
			{'id':'6','name':'Camlin Artists Oil Colours 20ml 12s 111702', 'price':'300.00 rs', 'description':'Set of 12 assorted Shades in 20 ml tube.Best result can be seen on Canvas, Oil Sketching Paper','exp_date':'','ingredients':''}]

for data in test_data:
	db.insert(data)

print test_data