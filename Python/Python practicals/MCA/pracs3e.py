Students={
    "student1":{
        "name":"kaus",
        "age":21,
        "marks":[70,90,81]
    },
    "student2":{
        "name":"neena",
        "age":27,
        "marks":[87,89,81]
    },
    "student3":{
        "name":"jina",
        "age":24,
        "marks":[56,89,74]
    },
    "student4":{
        "name":"canny",
        "age":23,
        "marks":[74,92,51]
    },
    "student5":{
        "name":"free",
        "age":22,
        "marks":[40,70,81]
    }
}

for stud,info in Students.items():
    print(stud,":",info)