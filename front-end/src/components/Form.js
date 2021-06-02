import React,{useState} from "react";
import Axios from "axios";


function Form () {
    const url = "http://localhost:6039/create"
    const[data, setData] = useState({
        name: "",
        date: "",
        classz: "",
        division: "",
        gender: "Female"
    })

    
    function submit(e) {
        e.preventDefault();
        console.log(data.gender)
        Axios.post(url, {
            name: data.name, 
            date: data.date,
            classz: data.classz,
            division: data.division,
            gender: data.gender
        })

        .then(res => {
            console.log(res.data)
        })
    }

    function handle(e){

        const newdata = {...data}
        newdata[e.target.id] = e.target.value
        setData(newdata)
        console.log(newdata)

    }


    return (
        <div>
        <form onSubmit= {(e) => submit(e)}>
        Name:
        <input onChange= {(e) => handle(e)} id = "name" value = {data.name} type = "text"></input>
        <br></br>
        DOB:
        <input onChange= {(e) => handle(e)} id = "date" value = {data.date} type = "date"></input>
        <br></br>
        Class
        <select onChange= {(e) => handle(e)} id = "classz" value = {data.classz}>
              <option value="I">I</option>
              <option value="II">II</option>
              <option value="III">III</option>
              <option value="IV">IV</option>
              <option value="V">V</option>
              <option value="VI">VI</option>
              <option value="VII">VII</option>
              <option value="VIII">VIII</option>
              <option value="IX">IX</option>
              <option value="X">X</option>
              <option value="XII">XII</option>
              <option value="XI2">XI2</option>
        </select>
        <br></br>
        Division
        <select onChange= {(e) => handle(e)} id = "division" value = {data.dicision}>
              <option value="A">A</option>
              <option value="B">B</option>
              <option value="C">C</option>
        </select>
        <br></br>

        <div>
        Gender:  Female
        <input onChange= {(e) => handle(e)} id = "gender" value = "Female" type = 'radio' checked = {data.gender === "Female"} ></input>
        Male
        <input onChange= {(e) => handle(e)} id = "gender" value = "Male" type = 'radio' checked = {data.gender === "Male"}></input>
        <br></br>
        </div>

        <input type ='submit' value ="Submit"></input>   
        </form>
        </div>
    );
};

export default Form;
