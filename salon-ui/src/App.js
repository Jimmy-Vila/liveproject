import './App.css';
import Test from "./Components/Test";

function App() {
  return (
    <div >
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
            {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
            <a className="navbar-brand" style={{"padding-left":"20px"}}>
                AR Salon and Day Spa
            </a>
        </nav>
        <Test/>
    </div>
  );
}

export default App;
