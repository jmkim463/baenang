import React from "react";
import {Route, Routes} from "react-router-dom";
import Location from "./page/Location"

const App = () => {
    return (
        <Routes>
            <Route path="/" element={<Location/>}/>
        </Routes>
    );
};

export default App;