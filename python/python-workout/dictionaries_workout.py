car = {
  "brand":"Ford",
  "model":"Mustang",
  "year":1964
}

car_keys = car.keys()
print(car_keys) #before the change
car["color"] = "white"
print(car_keys) #after the change

key_brand_name = car["brand"]
key_model_name = car["model"]
key_year_name = car["year"]
key_color_name = car["color"]

print(key_brand_name)
print(key_model_name)
print(key_year_name)
print(key_color_name)

car["color"] = "pink"
key_color_name = car["color"]
print(key_color_name)

car.update({"brand":"BYD","model":"Dolphin", "year":"2024","color":"yellow cheese"})
print(car)

car["eletric"] = True
print(car)

