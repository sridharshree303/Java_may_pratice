import React, { Component } from 'react'
import StudentServices from '../services/StudentServices'

 class GetAllStudent extends Component {
  constructor(props){
    super(props)
    this.state={
        students:[]
    }
    this.addStudent=this.addStudent.bind(this);
  }

  componentDidMount(){
    StudentServices.getAllStudents().then((res)=>{
     this.setState({students: res.data});
    });
  }

  addStudent(){
    this.props.history.push('/add-student');
  }

  render() {
    return (
      <div>
 <h2 className='text-center'> Student List</h2>
 <div className='row'>
 <button  className='btn-btn-primary' onClick={this.addStudent}>Add Student</button>
 {/* <Link to="/add"  type="button" class="btn btn-primary" style={{marginLeft:"800px"}}> Add Info</Link> */}
 </div>
    <div className='row'>
     
      <table className='table table-striped table-bordered'>
        <thead>
        <tr>
          <th>Student name</th>
          <th>Student address</th>
          <th>subject</th>
          <th>Action</th>
        </tr>
        </thead>

        <tbody>
          {
            this.state.students.map(
              student=>
              <tr key={student.id}>
                <td>{student.name}</td>
                 <td>{student.address}</td>
                <td>{student.subject}</td>

              </tr>
            )
          }
        </tbody>
       
      </table>
    </div>
      </div>
     
      )
  }
}

export default GetAllStudent;