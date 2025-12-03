import {useLoaderData} from 'react-router';

function Photos(props) {
    const photos = useLoaderData();


    return (
        <div>
            <h2>Data 모드</h2>
            <p>url 요청 -> loader 실행 -> 컴포넌트 렌더링 -> action 실행 ( 폼 제출시 ) </p>
            <ul>
                <li>loader : 컴포넌트 페이지 렌더링 전에 데이터 호출. useLoaderData()</li>
                <li>action : 폼 컴포넌트 제출 시 실행 </li>
                <li>errorElement : loader, action에서 오류 시 이 컴포넌트 실행</li>
            </ul>
            <h2>앨범 리스트</h2>
            <ol>
                {
                    photos.slice(0,10).map(({id,slug,title,thumbnail})=>(
                     <li key={id}>
                         {/*한 줄 인 경우 가능한 말줄임*/}
                         <h3 style = {{

                             overflow: 'hidden',
                             textOverflow : 'ellipsis',
                             whiteSpace: 'nowrap', // 줄바꿈금지
                             width : '100%'
                         }}

                         >{title}</h3>
                         <img src={thumbnail} alt={slug} />
                     </li>
                    ))

                }
            </ol>
        </div>

    );
}

export default Photos;