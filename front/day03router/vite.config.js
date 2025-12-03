import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/ : Server options -> server.proxy -> example
export default defineConfig({
  plugins: [react()],
    server: {
        proxy: { // CORS를 우회하기 위한 설정
            "/api" : { // api/**
                target: "https://jsonplaceholder.org",
                changeOrigin: true, //Origin 값 기준으로 요청, 차단하는 것을 방지
                // Origin 헤더 localhost:5173 -> jsonplaceholder.org 로 변경
                secure: false, // https 인증서 검증 x
                rewrite : (path) =>
                    path.replace(/^\/api/,''),
                    // api/photos -> photos

            }
        }
    }
})
