import React, {Component, Fragment} from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
import {API_URL} from "../../api/api";
import {LoadingIndicator} from "../../loader/LoadingIndicator";
import {appNotification as AppNotification} from "../AppNotification";

class ChooseService extends Component {
    constructor(props) {
        super(props);
        this.state = {
            "items": []
        };
    }


    handleErrors(response) {
        return new Promise((resolve, reject) => {

            if (!response.ok) {
                this.getErrorText(response).then(res => {
                    reject(res);
                })
            } else {
                resolve(response);
            }

        });
    }


    getErrorText = async (response) => {
        let result= null;
        try {
            result = await response.json()
        }catch (e) {

        }

        if(result && result["message"])
            return  result["message"]
        return  JSON.stringify(result);;
    };


    componentDidMount() {
        this.downloadServices()
    }

    onReceiveData(items){
        LoadingIndicator.hide();
        this.setState({
            items: items
        });

    }
    onError(error){
        LoadingIndicator.hide();
        AppNotification.showError("Unable to retrieve Spa Services  - " + error)
    }
    downloadServices(){

        LoadingIndicator.show();

        const url= API_URL + 'services/retrieveAvailableSalonServices';

        fetch(url)
            .then( res=> this.handleErrors(res))
            .then(res => res.json())
            .then((results) => this.onReceiveData(results))
            .catch(errorObject=>this.onError(errorObject))
    }

    render() {

        const {items} =this.state

        return (
            <Fragment>
                <div className="container-fluid row  text-center">
                    {items.map((item, index)=>{
                        return(
                            <div key={index} className="card mb-4 shadow-sm">
                                <div className="card-header">
                                    <h4 className="my-0 font-weight-normal">{item.name}</h4>
                                </div>
                                <div className="card-body">
                                    <h1 className="card-title pricing-card-title">${item.price} </h1>
                                    <ul className="list-unstyled mt-3 mb-4">
                                        <li>{item.description}</li>
                                        <li>{item.timeInMinutes} Minutes</li>
                                    </ul>
                                    <button
                                        type="button"
                                        onClick={(evt) => this.bookFor(item)}
                                        className="btn btn-lg btn-block btn-outline-primary"
                                        >
                                        Book Now
                                    </button>
                                </div>
                            </div>
                        );

                    })}

                </div>
            </Fragment>
        );
    }

    bookFor(item) {
        console.log(item)
    }
}

export default ChooseService;
