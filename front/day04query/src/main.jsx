import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'
import { ReactQueryDevtools } from '@tanstack/react-query-devtools'
import App from './App.jsx'
import { CssBaseline, ThemeProvider, createTheme } from "@mui/material";


// QueryClient 인스턴스 생성
const queryClient = new QueryClient({
  defaultOptions: {
    queries: {
      retry: 1,

      staleTime: 1000, // 1초 동안은 데이터를 '신선'하다고 판단하여 재호출하지 않음
    }
  }
});

const theme = createTheme({
  // 팔레트, 타이포그래피 등 설정
  typography: {
    fontFamily: ["Noto Sans KR", "-apple-system", "BlinkMacSystemFont", "Malgun Gothic", "맑은 고딕", "helvetica", "Apple SD Gothic Neo", "sans-serif"].join(',')
  },
  palette: {
    primary: {
      main: "#7ea4d0ff"
    },
    secondary: {
      main: "#73d486ff"
    }
  }
});

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <QueryClientProvider client={queryClient}>
      {/* [수정 3] ThemeProvider로 감싸야 createTheme 설정이 적용됨 */}
      <ThemeProvider theme={theme}>
        <CssBaseline />
        <App />
      </ThemeProvider>

      {/* react query 개발자 도구 */}
      {/* <ReactQueryDevtools initialIsOpen={false} /> */}
    </QueryClientProvider>
  </StrictMode>,
)