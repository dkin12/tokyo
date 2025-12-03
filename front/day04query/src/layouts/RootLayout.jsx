import React from 'react';
import { Link, NavLink, Outlet } from 'react-router';
import Footer from '../pages/Footer';
import {
    Box, AppBar, Toolbar, IconButton, Typography, Button
} from '@mui/material';
import MenuIcon from '@mui/icons-material/Menu';

function RootLayout() {
    const navLayout = {
        listStyle: 'none',
        padding: 0,
        display: 'flex',
        gap: 18
    }

    const listStyle = {
        color: 'inherit',
        textDecoration: 'none',
        display: 'inline-block'
    }

    const activeListStyle = {
        backgroundColor: 'orange',
        color: '#fff'
    }

    const active = ({ isActive }) => isActive ? activeListStyle : listStyle;

    return (
        // box == div 
        <Box sx={{ bgcolor: '#effdf2dd', minHeight: '100vh' }}>
            {/* 상단 고정바 ( 헤더 ) - static 는 같이 넘어가고, fixed : 따로 넘어감 , stick : 같이 넘어가는데,,뭐 다른거 잇음  */}
            <AppBar position="fixed" sx={{ bgcolor: "tomato" }}>
                {/* 정렬 */}
                <Toolbar>
                    {/* 양쪽 끝에서 하는거 flexGrow */}
                    <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                        todo Logo
                    </Typography>
                    <Button color="inherit" component={Link} to='/'>홈</Button>
                    <Button color="inherit" component={Link} to='/todos'>Todos</Button>
                </Toolbar>
            </AppBar>
            {/* <nav>
                <ul style={navLayout}>
                    <li>
                        <NavLink to="/" style={active}>Home</NavLink>
                    </li>
                    <li>
                        <NavLink to="/todos" style={active}>todos</NavLink>
                    </li>
                </ul>
            </nav>
            <hr /> */}

            <Box sx={{ p: 7 }}></Box>

            {/* 하위 컴포넌트(페이지)가 보이는 영역 */}
            <Outlet />
            <hr />

            <Footer />
        </Box>
    );
}

export default RootLayout;