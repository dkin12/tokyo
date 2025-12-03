import React from 'react';
import {Link, NavLink,Outlet} from "react-router";


// 공통 레이아웃
function RootLayout(props) {
    const onStyle = {color : '#fff',backgroundColor: 'lightBlue',padding : '2px 10px',
    textDecoration : 'none', fontWeight : 'bold'};
    const deStyle = {color : '#fff',textDecoration : 'none'};

    const linkStyle = ({isActive}) => isActive ? onStyle : deStyle;
    return (

        <div>
            {/*navLink를 사용하면 스타잉ㄹ 가능*/}
            <nav>
                <NavLink to="/" style={linkStyle}>Home</NavLink> | <NavLink to={"/photos"} style={linkStyle}>외부 이미지</NavLink> | <NavLink to="/about" style={linkStyle}  >About</NavLink> | {" "}
            <NavLink to={"/pro"} style={linkStyle}>products</NavLink>
            </nav>
        <hr/>
        {/*하위 컴포넌트(페이지)가 보이는 영역*/}
            <Outlet/>



        </div>
    );
}

export default RootLayout;