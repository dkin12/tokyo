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
            <nav>
                <NavLink to={"/"} style = {linkStyle} > Home </NavLink> |
                <NavLink to={"users"} style = {linkStyle} > Users </NavLink> |
                <NavLink to={"products"} style = {linkStyle} > Product </NavLink>
            </nav>
        <hr/>
            <Outlet/>
        </div>
    );
}

export default RootLayout;