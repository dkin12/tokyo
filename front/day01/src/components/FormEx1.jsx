import React, {useState} from 'react';


function FormEx1(){
    const [name, setName] = useState("");
    const [age , setAge] = useState(0);
    const [form, setForm] = useState({userid : "",phone:""})

    const change = (evt) =>{
        const {name,age} = evt.target;
        setForm({ ... form, [evt.target.name]: evt.target.value});
    }
    const {userid,phone} = form;

    return (
        <section className='boarderBottom'>
            <h2>여러 값을 객체로 관리</h2>
            <input type='text' name="userid" placeholder="아이디 입력" value = {form.userid} onChange={change}  />
            <input type='tel' name="phone" placeholder="전화번호 입력" value = {form.phone} onChange={change} />
            <p> 아이디 : {form.userid} / 연락처 : {form.phone} </p>

        <h2>입력</h2>
            <input type = "text" placeholder={"이름 입력"} onChange={(e) => setName(e.target.value)} />
            <input type = "number" placeholder={"나이 입력"} onChange={(e)=>setAge(e.target.value)}/>

            <p>이름 : {name} / 나이 : {age}</p>


        </section>
    )
}

export default FormEx1;