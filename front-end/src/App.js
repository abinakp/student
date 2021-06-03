import Form from './components/Form'
import Table from './components/Table'
import React, { Component } from 'react'
import axios from 'axios'
import ReactTable from "react-table"; 
import 'react-table/react-table.css'



export default class App extends Component {

  constructor(props){
    super(props)
    this.state = {
      users: [],
      loading:true
    }
  }
  async getUsersData(){
    const res = await axios.get('http://localhost:6039/all')
    console.log(res.data)
    this.setState({loading:false, users: res.data})
  }
  componentDidMount(){
    this.getUsersData()
  }
  render() {

    const columns = [{  
      Header: 'RegNo',  
      accessor: 'regno',
     }
     ,{  
      Header: 'Name',  
      accessor: 'name' ,
      }
     
     ,{  
     Header: 'DOB',  
     accessor: 'date' ,
     },
     {  
      Header: 'Class',  
      accessor: 'classz',
      },
      {  
        Header: 'Division',  
        accessor: 'division',
        },
        {  
          Header: 'Gender',  
          accessor: 'gender',
          }
  ]
    return (
    <div className="container">
    <Form getdata={() => this.getUsersData()}/>
      <ReactTable  
      data={this.state.users}  
      columns={columns}  
   />
   </div>
    )
  }
}