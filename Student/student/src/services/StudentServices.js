import axios from 'axios';
const STUDENT_API_URL="http://localhost:8082/getAllStudents";
class StudentServices{
    getAllStudents(){
        return axios.get(STUDENT_API_URL);
    }
    
}
export default new StudentServices();