import './App.css';
import LoadingIndicatorComponent from "./loader/LoadingIndicatorComponent";
import AppNotificationComponent from "./Components/AppNotificationComponent";
import ChooseService from "./Components/service/Choose-service";
import {Route, Router} from "react-router";
import Switch from "react-bootstrap/Switch";
import ChooseSlot from "./Components/service/Choose-slot";
import { createMemoryHistory } from 'history'

const history = createMemoryHistory()

function App() {
  return (
    <Router history={history}>
        <LoadingIndicatorComponent/>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a className="navbar-brand" href="/">Ar Salon & Day Spa</a>
        </nav>
        <div role="main" className="container">
            <div className="padding-container">
                <Switch>
                    <Route exact path="/" component={ChooseService}>
                    </Route>
                     <Route path="/chooseslot/:serviceId/:serviceName"  component={ChooseSlot}>
                    </Route>
                    <Route>
                        <ChooseService />
                    </Route>
                </Switch>

            </div>
        </div>
        <AppNotificationComponent/>
    </Router>
  );
}

export default App;
