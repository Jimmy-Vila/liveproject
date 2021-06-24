import './App.css';
import LoadingIndicatorComponent from "./loader/LoadingIndicatorComponent";
import AppNotificationComponent from "./Components/AppNotificationComponent";

import ChooseService from "./Components/service/Choose-service";
function App() {
  return (
    <div >
        <LoadingIndicatorComponent/>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a className="navbar-brand" href="/">Ar Salon & Day Spa</a>
        </nav>
        <div role="main" className="container">
            <div className="padding-container">
                <ChooseService>fsdf</ChooseService>
            </div>
        </div>
        <AppNotificationComponent/>
    </div>
  );
}

export default App;
