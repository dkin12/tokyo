import React from 'react';
import './App.css'
import StateEx1 from "./components/StateEx1.jsx";
import StateEx2 from "./components/StateEx2.jsx";
import StateEx3 from "./components/StateEx3.jsx";
import ListEx1 from "./components/ListEx1.jsx";
import ListEx2 from "./components/ListEx2.jsx";
import ListEx3 from "./components/ListEx3.jsx";
import FormEx1 from "./components/FormEx1.jsx";
import FormEx2 from "./components/FormEx2.jsx";
import FormEx3 from "./components/FormEx3.jsx";
import Todos from "./components/Todos.jsx";

function App(props) {
    return (
        <>
            <Todos/>


            {/*<FormEx3 />*/}
            {/*<FormEx2/>*/}
            {/*<FormEx1/>*/}
            {/*<ListEx3/>*/}
            {/*<ListEx2/>*/}
            {/*<ListEx1/>*/}

            {/*<StateEx1/>*/}
            {/*<StateEx2 />*/}
            {/*<StateEx3 />*/}
        </>
    );
}

export default App;