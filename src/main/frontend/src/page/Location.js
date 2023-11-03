import React from "react";
import {Map, MapMarker} from "react-kakao-maps-sdk";


const Location = () => {
    return (
        <div style={{
            width: "100%",
            height: "100%"
        }}>
            <Map
                center={{ lat: 36.2683, lng: 127.6358 }}
                style={{
                    width: "100%",
                    height: "100%",
                    position:"absolute",
                    left:0,
                    top:0,
                    margin:0,
                    padding:0,
                }}
                level={12}
            >



            </Map>
        </div>
    );
};

export default Location;