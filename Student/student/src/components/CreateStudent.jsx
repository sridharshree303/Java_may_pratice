import React, { Component } from 'react'

 class CreateStudent extends Component {
     constructor(props){
        super(props)

        this.state={
              name:'',
              address:'',
              subject:''
        }
       this.chaangeFullName=this.chaangeFullName.bind(this);
       this.chaangeAddress=this.chaangeAddress.bind(this);
       this.chaangeSubject=this.chaangeSubject.bind(this);
       this.saveStudent=this.saveStudent.bind(this);
     }
        
     saveStudent=(e)=>{
        e.preventDefault();
        let student= {name:this.state.name, address:this.state.address , subject : this.state.subject};
        console.log('employee=>' + JSON.stringify(student))
     }

     chaangeFullName=(event)=>{
        this.setState({name:event.target.value});
     }

     chaangeAddress=(event)=>{
        this.setState({address:event.target.value});
     }
     
     chaangeSubject=(event)=>{
        this.setState({subject:event.target.value});
     }

  render() {
    return (
      <div>
       <div className='container'>
        <div className='row'>
            <div className='text col-md-6 offset-md-3 offset-md-3'>
           <div className='card-body'>
            <form>
                <div className='form-group'>
                    <label>Full Name</label>
                    <input placeholder='Full Name' name='fullName' className='form-control'
                     value={this.state.name} onChange={this.chaangeFullName}></input>
                </div>

                <div className='form-group'>
                    <label>Full Name</label>
                    <input placeholder='Address' name='address' className='form-control'
                     value={this.state.address} onChange={this.chaangeAddress}></input>
                </div>

                <div className='form-group'>
                    <label>Subject</label>
                    <input placeholder='Subject' name='subject' className='form-control'
                     value={this.state.subject} onChange={this.chaangeSubject}></input>
                </div>

                <button className='btn btn-success' onClick={this.saveStudent}>Save</button>
                <button className='btn btn-danger' onClick={this.cancel.bind(this)} style={{marginLeft:'10px'}}>Cancel</button>
            </form>
           </div>
            </div>
        </div>
       </div>
      </div>
    )
  }
}
export default CreateStudent;