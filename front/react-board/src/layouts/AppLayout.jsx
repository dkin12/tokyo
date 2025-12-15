// header + menu + Outlet

import React from 'react';
import { Link, Outlet } from 'react-router';
import { Box, AppBar, Toolbar, Typography, Container, Stack, Button } from '@mui/material';
import { LuDog } from "react-icons/lu";

function AppLayout() {
    return (
        <Box sx={{ minHeight: '100vh', bgcolor: '#faf4cfff' }}>

            <AppBar position='fixed'>
                <Container maxWidth='md'>
                    <Toolbar sx={{ display: 'flex', justifyContent: 'space-between' }}>
                        {/* 로고  */}
                        <Box component={Link} to="/posts" sx={{
                            display: 'flex', alignItems: 'center',
                            textDecoration: 'none', color: '#fff'
                        }}>



                            {/* 폰트 아이콘 */}
                            <Box sx={{
                                width: 40, height: 40,
                                borderRadius: '50%',
                                bgcolor: '#faf4cfff',
                                display: 'grid',
                                placeItems: 'center',
                                mr: 1.5
                            }}>


                                <LuDog style={{ color: '#000000ff', fontSize: 20 }} />
                            </Box>

                            <Typography variant="h6" component="h1" sx={{ fontWeight: 700 }}>
                                게시판
                            </Typography>



                        </Box>
                        {/* 회원가입 / 로그인  */}
                        <Stack direction="row" spacing={0.8} alignItems={"center"} >
                            <Button component={Link} to="/posts" variant='text' sx={{ color: '#fff' }}>로그인</Button>
                            <Button component={Link} to="/posts" variant='text' sx={{ color: '#fff' }}>회원가입</Button>
                        </Stack>
                    </Toolbar>
                </Container>

            </AppBar >

            <Container maxWidth='md' component="main" sx={{ pt: 10, mb: 4 }}>
                <Outlet />
            </Container>
        </Box >
    );
}

export default AppLayout;