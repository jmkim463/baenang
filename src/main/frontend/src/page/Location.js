import React, {useState} from "react";
import {Map, MapMarker, MarkerClusterer} from "react-kakao-maps-sdk";
import * as cluster from "cluster";


const Location = () => {
    const [placeList, setPlaceList] = useState([]);
    const getBoardList = async () => {
        const resp =
    }

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
                <MarkerClusterer
                    averageCenter={true}
                    minLevel={10}
                >
                    {}
                </MarkerClusterer>
            </Map>
        </div>
    );
};

export default Location;