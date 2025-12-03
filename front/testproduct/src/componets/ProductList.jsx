import React, {useState} from 'react';

function ProductList(props) {

    const [list, setList] = useState([]);
    const [name, setName] = useState('');
    let [id, setId] = useState(1);
    const [editId, setEditId] = useState(null);

    const add = ()  => {


        setList(prev => ([...prev,{
            id : id, name:name}
        ] ));

        setId(prev => prev + 1);
        setName("");

    }

    const remove = (id) =>{
        setList((prev) => prev.filter(item => item.id !== id));

    }

    const edit = (id,name) =>{
        setEditId(id);
        setName(name)
    }

    const saveEdit =() =>{
        setList(prev => prev.map(item => item.id === editId ? {
            ...item, name : name}:item));
        setEditId(null);
        setName("");
    }




    return (
        <div style={{margin: '10px'}}>
            <h2>제품 리스트 ( 자동 증가 ID )</h2>
            <input type= "text"
                   placeholder= "제품명을 입력"
                   value={name}
                   onChange={e => setName(e.target.value)}/>

            {editId === null ? (
                <button disabled={name.trim().length === 0} onClick={add}>
                    추가
                </button>
            ) : (
                <button disabled={name.trim().length === 0} onClick={saveEdit}>
                    수정완료
                </button>
            )}
            <hr/>
            <ul>
                {list.map(item => (
                    <li key={item.id} style={{margin : '10px 0'}}>

                        {item.id}번째 제품명 :  {item.name}
                        <button onClick={() => edit(item.id,item.name)}>수정</button>
                        <button onClick={() => remove(item.id)} style={{marginLeft: 10}}>삭제</button>
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default ProductList;