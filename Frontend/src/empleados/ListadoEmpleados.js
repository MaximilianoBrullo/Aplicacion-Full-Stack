import React from 'react'

export default function ListadoEmpleados() {
  return (
    <div className="container">
        <div className="container text-center" style={{marginTop: '30px'}}>
            <h3>Sistemas de recursos humanos</h3>
        </div>
        <table className="table table-striped" style={{marginTop: '30px'}} table-hover align-middle>
            <thead>
                <tr>
                <th scope="col">Id</th>
                <th scope="col">Nombre</th>
                <th scope="col">Apellido</th>
                <th scope="col">Sueldo</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                </tr>
                <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                </tr>
                <tr>
                <th scope="row">3</th>
                <td>John</td>
                <td>Doe</td>
                <td>@social</td>
                </tr>
            </tbody>
        </table>
    </div>
  )
}
