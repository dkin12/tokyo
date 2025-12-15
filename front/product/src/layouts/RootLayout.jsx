

// 라우터 트리
import '../App.css'
import { Link, NavLink, Outlet } from 'react-router';

function RootLayout() {
  return (



    <nav>
      <ul>
        <li>
          <Outlet />
        </li>
      </ul>
    </nav>
  )
}

export default RootLayout;