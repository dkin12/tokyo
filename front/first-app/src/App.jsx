import {useState} from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import BasicEx1 from "./components/BasicEx1.jsx";
import BasicEx2 from "./components/BasicEx2.jsx";
import BasicEx3 from "./components/BasicEx3.jsx";
import BasicEx4 from "./components/BasicEx4.jsx";
import BasicEx5 from "./components/BasicEx5.jsx";


// 자바 스크립트 영역
function App() {
    const [count, setCount] = useState(0)
    // 자바스크립트 영역
    /*

    JSX
    JavaScript + XML
    Html처럼 보이는 자바스크립트 문법으로 브라우저가 직접 읽을 수 없기 때문에 babel과 같은 트랜스파일러로 변환

    html5: <br> <img> <hr>
    xhtml(xml) : <br/> <img/> <hr/>
    onClick() -> onClick() react 버전 : 카멜표기법
    AddEventListener()

    컴포넌트 주의사항
    1. 하나의 문서에는 되도록 하나의 컴포넌트만 작성
    2. 컴포넌트명은 반드시 대문자로 시작
    3. 문서명과 컴포넌트명은 동일
    4. vite 컴포넌트 파일 확장자가 .jsx
    <> </>, <Fragment></Fragment> 렌더링이 될 때 html 구조에 영향을 주지 않음

    return 키워드 이후가 화면에 보이는 영역으로
    반드시 부모 요소 하나가 전체를 감싸는 형태를 가져야함
    */


    return (
        // 자바 스크립트 영역, 거의 활용하지 않는 영역
        <>
            {/*JSX 영역、JSX 주석 처리*/}
            {/*<BasicEx4 title ="하위 요소 통으로 넣기">*/}
            {/*    <p> 여기에 작성한 내용이 children에 들어갑니다.</p>*/}
            {/*    <p> Basic4 하위에 작성된 내용이 다 들어갑니다.</p>*/}

            {/*</BasicEx4>*/}
            {/*<BasicEx1/>*/}
            {/*<BasicEx2/>*/}
            {/*<BasicEx3 menu = "목화솜 탐수육"/>*/}
            {/*<BasicEx3 menu = "마라탕"/>*/}
            <BasicEx5/>

            <main style={{borderTop: "2px solid #000"}}>
                <a href="https://vite.dev" target="_blank">
                    <img src={viteLogo} className="logo" alt="Vite logo"/>
                </a>
                <a href="https://react.dev" target="_blank">
                    <img src={reactLogo} className="logo react" alt="React logo"/>
                </a>

                <h1>Vite + React</h1>
                <button onClick={() => setCount((count) => count + 1)}>
                    count is {count}
                </button>
            </main>
        </>
    )
}

export default App
