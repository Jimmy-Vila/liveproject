import {Component} from 'react'
class Test extends Component {

    componentDidMount() {
        const apiUrl = 'http://localhost:8080/GET/salon';
        fetch(apiUrl)
            .then((response) => response.json())
            .then((data) => console.log('This is your data', data));
    }

    render() {
        return (
            <div className={"container"}>
                <div className="alert alert-primary" role="alert">
                    A simple primary alert—check it out!
                </div>
            </div>
        );
    }
}

export default Test;
