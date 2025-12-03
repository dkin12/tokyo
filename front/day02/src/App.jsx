import React from 'react';
import './App.css'
import ComEx1 from "./components/ComEx1.jsx";
import ComEx2 from "./components/ComEx2.jsx";
import ComEx3 from "./components/ComEx3.jsx";
import ComEx4 from "./components/ComEx4.jsx";
import ComEx5 from "./components/ComEx5.jsx";
function App(props) {
    return (
        <>
            <ComEx5 />
            <ComEx4 />
            <ComEx3 />
            <ComEx2 />
            <ComEx1 />
        </>
    );
}

export default App;