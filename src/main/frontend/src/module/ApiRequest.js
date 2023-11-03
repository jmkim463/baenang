import axios from "axios";

const instance = axios.create({
    baseURL: "http://localhost:8080/api/v1/"
});

const request = {
    get: async (url) => {
        try {
            const resp = await instance.get(url);
            return resp;
        } catch (err) {
            throw new Error(err);
        }
    },
    post: async (url, data) => {
        try {
            const resp = await instance.post(url, data);
            return resp;
        } catch (err) {
            throw new Error(err);
        }
    }
}

export default request;