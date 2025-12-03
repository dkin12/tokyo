import React from 'react';

const ListEx2 = () => {
    const items = ['사과','오렌지'];
    const scores = [80,85,91,98];
    const animals = ['강아지','고양이','고라니','곰'];

    return (
        <section className="boarderBottom">
            <h2>리스트 항목 스타일에 조건 추가</h2>
            <h2>조건부 + 리스트 </h2>
            {/*동물 배열이 있으면 있습니다. 출력 , 없으면 없습니다. 출력*/}
            {/*동물 배열이 있으면 리스트 출력*/}
            { animals.length == 0 ? <p> 데이터 없음 </p> : <p> 데이터 있음
                {animals.map(item => (
                    <li key={item.id}>{item}</li>
                ))}
            </p>}
            {
                animals.length > 0 && <ul>
                {animals.map((animal,idx) => (
                    <li key={idx}>{animal}</li>
                ))}
                </ul>
            }



            <h2> 리스트 항목 스타일에 조건 추가 </h2>
            <ul>
                {/**/}
                {scores.map((score, index) => (
                    //  90이상인 경우 배경색 추가
                    <li key={index} style={
                        { backgroundColor: score >= 90 ? 'tomato' :'transparent'}
                    }>{score}</li>
                ))}
            </ul>


            <h2>조건부 렌더링 ( 빈 배열 처리 ) </h2>
            {/*배열의 요소가 있으면 <p>데이터 있음</p> <p>없으면 데이터 없음 출력</p>*/
            }
            { items.length == 0 ? <p> 데이터 없음 </p> : <p> 데이터 있음 </p>}

        </section>
    );
};

export default ListEx2;