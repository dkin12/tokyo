import React from 'react';
import LikeBtn from "./child/LikeBtn.jsx";

const ComEx3 = () => {
    const [total, setTotal] = React.useState(1000);

    const handlerLike = ()=>{
        setTotal(prev => prev + 1);
    }

    return (
        <section className='borderTop'>
            <h2>자식 컴포넌트의 값을 부모가 받음</h2>
        {/* 어떤 버튼을 클릭하든 숫자 업데이트*/}
            <p>총 좋아요 수 : {total}</p>
            <LikeBtn onLike = {handlerLike}/>
            <LikeBtn onLike = {handlerLike}/>
            <LikeBtn onLike = {handlerLike}/>

        </section>
    );
};

export default ComEx3;