import React from 'react';
import {BrowserRouter, Link, Route, Routes} from "react-router";
import Home from "./Home.jsx";
import About from "./About.jsx";
import NotFoundPage from "./NotFoundPage.jsx";

function DeclarativeRouter(props) {
    return (
        <BrowserRouter>
            <nav>
                <Link to="/">Home</Link> | <Link to="/about">About</Link> | {" "}
                {/*  리액트에서는 거의 사용하지 않음
                    <a href="intro">Go naver</a> */}
            </nav>

            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/about" element={<About />} />
                {/*제일 마지막에 작성*/}
                <Route path="*" element={<NotFoundPage/>} />
            </Routes>
        </BrowserRouter>
    );
}

export default DeclarativeRouter;